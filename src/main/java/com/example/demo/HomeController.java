package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    StoryRepository storyRepo;






    @RequestMapping("/")
    public String stories(Model model) {
        System.out.println("stories");
        model.addAttribute("CIM", "ez lesz a cim");
        model.addAttribute("sztorik", getStories());

        return "stories";
    }


  /*  @RequestMapping("/user/{id}")
    public String searchForUser(@PathVariable(value="id") String id, Model model) throws Exception
    {
        System.out.println("searchForUser");
        if  (id == null)
        {
            System.out.println("ID NULL VOLT");
            throw new Exception("nincs ilyen id val felh.!!!");

        }
        else
        {
            model.addAttribute("sztorik", storyRepo.findById(id));
        }
        return "stories";
    }


    @RequestMapping("/story/{title}")
    public String searchForStory(@PathVariable(value="title") String title, Model model) throws Exception
    {
        System.out.println("searchForTitle");
        if (title == null)
        {
            System.out.println("ID NULL VOLT");
            throw new Exception("nincs ilyen id val sztory.!!!");

        }
        else
        {
           // List<Story> storyList = (List)storyRepo.findByTitle(title);
            model.addAttribute("sztorik",storyRepo.findByTitle(title) );
        }
        return "stories";
    }

*/

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest ra, Exception ex, Model model){
        System.out.println("exceptionHandler");
        model.addAttribute("ERRMESSAGE", ex.getMessage());
        model.addAttribute("ERRCODE", ex.getCause());
        model.addAttribute("STACK", ex.getStackTrace());
        return "exceptionHandler";
    }

    public List<Story> getStories(){
        List<Story> sztorik = storyRepo.findAll();
        System.out.println("MERET:" + sztorik.size());

       /* Story sztori_1 = new Story();
        sztori_1.setTitle("sztori_1");
        sztori_1.setAuthor("Gyula");
        sztori_1.setContent("blabla1");
        sztori_1.setPosted(new Date());

        Story sztori_2 = new Story();
        sztori_2.setTitle("sztori_2");
        sztori_2.setAuthor("Peter");
        sztori_2.setContent("blabla2");
        sztori_2.setPosted(new Date());

        Story sztori_3 = new Story();
        sztori_3.setTitle("sztori_3");
        sztori_3.setAuthor("Jakab");
        sztori_3.setContent("blabla3");
        sztori_3.setPosted(new Date());

        sztorik.add(sztori_1);
        sztorik.add(sztori_2);
        sztorik.add(sztori_3);

        */
        return sztorik;
    }






}
