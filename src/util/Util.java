package util;

import java.security.MessageDigest;

/**
 * Created by A on 2019-02-10 오후 4:36
 * re / util
 * No pain, No gain!
 * What :
 * Why :
 * How :
 * << 개정이력(Modification Information) >>
 * 수정일         수정자          수정내용
 * -------       --------       ---------------------------
 * 2019/02/10     김진국          블록체인 최초 생성
 * 2017/05/27     이몽룡          인증이 필요없는 URL을 패스하는 로직 추가
 *
 * @author 개발팀 김진국
 * @version 1.0
 * @see
 * @since 2018/04/01
 */


public class Util {

    public static String getHash(String input) {
        StringBuffer result = new StringBuffer();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(input.getBytes());
            byte bytes[] = md.digest();
            for (int i = 0; i < bytes.length; i++) {
                result.append(
                        Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}