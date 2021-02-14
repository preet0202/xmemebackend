package com.xmemebackend.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xmemebackend.springrest.entity.Memes;
import com.xmemebackend.springrest.services.MemeService;

@CrossOrigin(origins="*",allowedHeaders="*")

@RestController 
 public class MyController {
	
	@Autowired
	private MemeService memeService;
	
	
	@GetMapping("/memes")
	
	public List<Memes> getMemes(){
		
		return this.memeService.getMemes();
		
	}
	
	@GetMapping("/memes/{memeId}")
	public Memes getMemes(@PathVariable String memeId) {
		
		System.out.println(memeId);
		return this.memeService.getMemes(memeId);
		//System.out.println(memeId);
	}
	
	@PostMapping("/memes")
	public Memes addMemes(@RequestBody Memes meme) {
		System.out.println("name "+meme.getName());
		return this.memeService.addMeme(meme);
		
	}
	
	@PutMapping("/memes")
	public Memes updateMemes(@RequestBody Memes meme) {
		
		return this.memeService.updateMeme(meme);
		
	}
	
	
	

}
