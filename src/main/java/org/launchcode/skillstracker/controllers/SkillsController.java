package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skillsList(){
        String html =
                "<html>" +
                        "<body>" +
                            "<h1> Skills Tracker </h1>" +
                            "<h2> List of skills to learn: </h2>" +
                            "<ol>" +
                            "<li> Javascript </li>" +
                            "<li> Java </li>" +
                            "<li> Python </li>" +
                            "</ol>" +
                        "</body>" +
                "</html>";
        return html;
    }



    @GetMapping("form")
    public String skillsForm(){
        String htmlForm =
                "<html>" +
                    "<body>" +
                        "<form method = 'post' action = '/form'> " +
                        "<label for = 'name'> Name </label>" +
                        "<input type = 'text' name = 'name' /><br>" +
                        "<label for = 'language1'> My Favorite Language </label>" +
                        "<select name= 'language1'>" +
                            "<option value= 'Java'>Java</option>" +
                            "<option value = 'Javascript'>Javascript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select><br>" +
                        "<label for = 'language2'> My Second Favorite Language </label>" +
                        "<select name= 'language2'>" +
                            "<option value= 'Java'>Java</option>" +
                            "<option value = 'Javascript'>Javascript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select><br>" +
                        "<label for = 'language3'> My Third Favorite Language </label>" +
                        "<select name= 'language3'>" +
                            "<option value= 'Java'>Java</option>" +
                            "<option value = 'Javascript'>Javascript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select><br>" +
        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                    "</body>" +
                "</html>";
        return htmlForm;
    }


    @PostMapping("form")
    public String finalView(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + language1 + "</li>" +
                        "<li>" + language2 + "</li>" +
                        "<li>" + language3 + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;

    }

}
