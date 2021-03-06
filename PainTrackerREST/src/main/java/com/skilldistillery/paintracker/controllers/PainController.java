package com.skilldistillery.paintracker.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.paintracker.entities.Pain;
import com.skilldistillery.paintracker.services.PainService;

@RestController
@RequestMapping("api")
public class PainController {

	@Autowired
	private PainService svc;

	@GetMapping("pain")
	public List<Pain> index() {
		return svc.allPains();
	}
	
	@GetMapping("pain/search/intensity/{low}/{high}")
	  public List<Pain> getPainWithinAnIntensityRange(@PathVariable int low,@PathVariable int high){
		  return svc.allPainWithinAnIntensityRange(low, high);
	  }
	//CRUD - CREATE
	@PostMapping("pain")
    public Pain addPain(@RequestBody Pain pain, HttpServletRequest req, HttpServletResponse resp) {
		pain = svc.create(pain);
        if (pain != null) {
            resp.setStatus(201);
            StringBuffer sb = req.getRequestURL();
            sb.append("/").append(pain.getId());
            resp.addHeader("Location", sb.toString());
        }
        return pain;
    }
	//CRUD - READ
	@RequestMapping(path="pain/{id}", method=RequestMethod.GET)
	 public Pain show(@PathVariable int id, HttpServletResponse resp){
		if (svc.findById(id) != null ) {
	   return svc.findById(id);
		} else {
			resp.setStatus(404);
		return null;
		}
	 }
	//CRUD - DELETE
	 @DeleteMapping("pain/{id}")
	    public void deleteComment(@PathVariable("id") Integer id, HttpServletResponse resp) {
	       
	        if (svc.findById(id) != null) {
//	           if( svc.deleteById(id)) {
	        	svc.deleteById(id);
	        	resp.setStatus(204);
//	           }
//	                resp.setStatus(204);
//	            } else {
//	                resp.setStatus(404);
	            }
//	        } else {
//	            resp.setStatus(404);
//	        }
	    }
	 //CRUD - UPDATE
	 @PutMapping("pain/{id}")
	  @ResponseBody
	  public Pain updatePain(@PathVariable Integer id, 
			  @RequestBody Pain pain, HttpServletRequest req,
				 HttpServletResponse resp) {
		
		return svc.updatePain(id, pain); 
	}
}
