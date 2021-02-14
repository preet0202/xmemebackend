package com.xmemebackend.springrest.services;

import java.util.List;

import com.xmemebackend.springrest.entity.Memes;

public interface MemeService {
	
	public List<Memes> getMemes();
	
	public  Memes getMemes(String memeId);

	public Memes addMeme(Memes meme);

	public Memes updateMeme(Memes meme);
		
	

}
