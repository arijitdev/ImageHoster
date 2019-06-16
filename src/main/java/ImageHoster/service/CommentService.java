package ImageHoster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ImageHoster.repository.ImageRepository;

@Service
public class CommentService {
	
	@Autowired
    private ImageRepository imageRepository;

}
