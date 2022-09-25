package com.supercarmarket.dev.controller;

import com.supercarmarket.dev.domain.download.Download;
import com.supercarmarket.dev.domain.enumData.PaparazziRatingEnum;
import com.supercarmarket.dev.domain.enumData.ProductRatingEnum;
import com.supercarmarket.dev.domain.enumData.ProductStatusEnum;
import com.supercarmarket.dev.domain.magazine.Magazine;
import com.supercarmarket.dev.domain.paparazzi.Paparazzi;
import com.supercarmarket.dev.domain.product.Category;
import com.supercarmarket.dev.domain.product.Product;
import com.supercarmarket.dev.domain.product.ProductBrand;
import com.supercarmarket.dev.domain.product.ProductModel;
import com.supercarmarket.dev.domain.user.User;
import com.supercarmarket.dev.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardRepository boardRepository;
    private final PaparazziRepository paparazziRepository;
    private final MagazineRepository magazineRepository;
    private final ProductRepository productRepository;
    private final ProductModelRepository productModelRepository;
    private final ProductBrandRepository productBrandRepository;
    private final DownloadRepository downloadRepository;
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;




    @GetMapping("/board")
    public ResponseEntity<?> getBoard(){
        return ResponseEntity.ok().body(boardRepository.findAll());
    }

    @PostMapping("/board")
    @Transactional
    public void createBoard(){
        User user = userRepository.save(User.builder()
                .userNickname("test").build());
        Category category = new Category();
        category.setCategoryName("category test");
        categoryRepository.save(category);


        Paparazzi paparazzi = new Paparazzi();
        paparazzi.setTitle("title");
        paparazzi.setContents("contents");
        paparazzi.setLikeCount(0);
        paparazzi.setViewCount(0);
        paparazzi.setCmtCount(0);
        paparazzi.setBlameCount(0);
        paparazzi.setCategory(category);
        paparazzi.setUser(user);
        paparazzi.setPrzRating(PaparazziRatingEnum.BEFORE_CONFIRM);
        paparazziRepository.save(paparazzi);


        Magazine magazine = new Magazine();
        magazine.setTitle("title");
        magazine.setContents("contents");
        magazine.setLikeCount(0);
        magazine.setViewCount(0);
        magazine.setCmtCount(0);
        magazine.setBlameCount(0);
        magazine.setCategory(category);
        magazine.setUser(user);
        magazine.setMgzBannerImageUrl("image url test");
        magazineRepository.save(magazine);



        ProductBrand productBrand = ProductBrand.builder()
                .brandName("테슬라")
                .build();
        productBrandRepository.save(productBrand);

        ProductModel productModel = ProductModel.builder()
                .modelName("xxx")
                .modelTrim("yyy")
                .productBrand(productBrand).build();
        productModelRepository.save(productModel);

        Product product = new Product();
        product.setTitle("title");
        product.setContents("contents");
        product.setLikeCount(0);
        product.setViewCount(0);
        product.setCmtCount(0);
        product.setBlameCount(0);
        product.setCategory(category);
        product.setUser(user);
        product.setInsuranceUrl("매물 보험이력");
        product.setPerformanceUrl("성능검사표 1");
        product.setProductRatingEnum(ProductRatingEnum.BEFORE_CONFIRM);
        product.setProductStatusEnum(ProductStatusEnum.OK_CONFIRM);
        product.setAppear(false);
        product.setProductModel(productModel);
        productRepository.save(product);


        Download download = new Download();
        download.setTitle("title");
        download.setContents("contents");
        download.setLikeCount(0);
        download.setViewCount(0);
        download.setCmtCount(0);
        download.setBlameCount(0);
        download.setCategory(category);
        download.setUser(user);
        downloadRepository.save(download);
    }
}
