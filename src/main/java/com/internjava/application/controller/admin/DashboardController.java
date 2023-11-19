package com.internjava.application.controller.admin;

import com.internjava.application.model.dto.ChartDTO;
import com.internjava.application.model.dto.StatisticDTO;
import com.internjava.application.model.request.FilterDayByDay;
import com.internjava.application.repository.BrandRepository;
import com.internjava.application.repository.CategoryRepository;
import com.internjava.application.repository.ProductRepository;
import com.internjava.application.repository.StatisticRepository;
import com.internjava.application.repository.UserRepository;
import com.internjava.application.service.BrandService;
import com.internjava.application.service.CategoryService;
import com.internjava.application.service.OrderService;
import com.internjava.application.service.PostService;
import com.internjava.application.service.ProductService;
import com.internjava.application.repository.*;
import com.internjava.application.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Controller
public class DashboardController {



    @GetMapping("/admin")
    public String dashboard(Model model){
        return "admin/product/list";
    }


}
