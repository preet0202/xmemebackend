package com.xmemebackend.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmemebackend.springrest.dao.MemeDao;
import com.xmemebackend.springrest.entity.Memes;

@Service
public class MemeServiceimpl implements MemeService {
	
	@Autowired
	private MemeDao memeDao;

	
	//List<Memes>  list;
	
	public MemeServiceimpl() {
		
//		list = new ArrayList<>();
//		list.add(new Memes("Preet","chaiii","gjdsgdsjgdj"));
//		list.add(new Memes("Preet","chai","8797997979"));
	}
	
	@Override
	public List<Memes> getMemes() {
		
		return memeDao.findAll();
	}

	@Override
	public Memes getMemes(String memeId) {
		
//		Memes m = null;
//		for( Memes meme:list) {
//			System.out.println("reached");
//			if (meme.getUrl().equals(memeId)) {
//				System.out.println("redfdffdached");
//				m = meme;
//				break;
//			}
//		}
		System.out.println(memeId);
		return memeDao.getOne(memeId);
		
	}
	
	public Memes addMeme( Memes meme) {
		//list.add(meme);
		System.out.println("des "+meme.getId());
		memeDao.save(meme);
		System.out.println("name "+meme.getDescription());
		return meme;
	}
	
	public Memes updateMeme(Memes meme) {
//		list.forEach(e ->{
//			if(e.getUrl().equals(meme.getUrl())) {
//				e.setName(meme.getName());
//				e.setDescription(meme.getDescription());
//			}
//		});
		
		memeDao.save(meme);
		return meme;
	}

}
