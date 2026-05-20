/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import fu.bean.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student/")
/**
 *
 * @author MSI
 */
public class StudentController {

    @Autowired
    ServletContext application;

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpSession session) {
        application.setAttribute("name", "Phạm Minh Tuấn");
        application.setAttribute("level", 2);

        session.setAttribute("name", "Nguyễn Thị Kiều Oanh");
        session.setAttribute("level", 4);

        request.setAttribute("name", "Lê Phạm Tuấn Kiệt");
        request.setAttribute("level", 3);

        session.setAttribute("salary", 1000);
        request.setAttribute("photo", "images/poly-sv.png");

        return "student/index";

    }

    @RequestMapping("index2")
    public String index2(ModelMap model) {
        Student sv1 = new Student("Phạm Minh Tuấn", 5.5, "Ứng dụng phần mềm");
        Student sv2 = new Student("Nguyễn Thị Kiều Oanh", 9.5, "Thiết kế trang web");
        Student sv3 = new Student("Lê Phạm Tuấn Kiệt", 3.5, "Thiết kế trang web");

        List<Student> list = new ArrayList<>();
        list.add(sv2);
        list.add(sv3);

        Map<String, Student> map = new HashMap<>();
        map.put("OanhNTK", sv2);
        map.put("KietLPT", sv3);

        model.addAttribute("bean", sv1);
        model.addAttribute("list", list);
        model.addAttribute("map", map);

        return "student/index2";
    }

}
