package controller;

import model.Dao.ShopDao;
import model.Dto.ShopDto;

import java.util.ArrayList;

public class ShopController {

    //싱글톤
    private static final ShopController shopController = new ShopController();
    private ShopController(){}
    public static ShopController getInstance(){
        return shopController;
    }

    //회원가입 등록 제어 함수
    public int shopRegister(String id, String pwd, int phnum) {
        ShopDto shopDto = new ShopDto(id, pwd, phnum);
        // 1. 중복검사를 해주는 select dao 처리
        // 2. 문자열길이 <-- 자바처리
        // 3. 비밀번호 타입 확인 <--- 자바처리
        // -----> 위코드가 모두 통과
        // 4. 등록처리
        // 5. DB오류
        return ShopDao.getInstance().register(shopDto);
    }

    //로그인 등록 제어 함수
    public boolean shopLogin(String id, String pwd){
        ShopDto shopDto = new ShopDto(id, pwd);
        return ShopDao.getInstance().login(shopDto);
    }

    //카테고리 보기 제어 함수
    public ArrayList<ShopDto> categoris(){
        ArrayList<ShopDto> result = ShopDao.getInstance().categories();
        return result;
    }

    //상품추가 제어함수
    public boolean productAdd(ShopDto productAddDto){
boolean result=ShopDao.getInstance().productAdd(productAddDto);
 return result;
    }
}