package core;

import java.util.ArrayList;

/**
 * Created by A on 2019-02-10 오후 4:47
 * re / core
 * No pain, No gain!
 * What :
 * Why :
 * How :
 * << 개정이력(Modification Information) >>
 * 수정일         수정자          수정내용
 * -------       --------       ---------------------------
 * 2018/04/01     김진국          최초 생성
 * 2017/05/27     이몽룡          인증이 필요없는 URL을 패스하는 로직 추가
 *
 * @author 개발팀 김진국
 * @version 1.0
 * @see
 * @since 2018/04/01
 */


public class BlockChainStarter {

    public static void main(String[] args) {

        //System.out.println(Util.getHash("김진국"));

/*        int nonce = 0;

        while (true) {
            if (Util.getHash(nonce + "").substring(0, 6).equals("000000")) {
                System.out.println("정답 : " + nonce);
                System.out.println("해시 값 : " + Util.getHash(nonce + ""));
                break;
            }
            nonce++;
        }*/

        /*
        Block block1 = new Block(1, null, 0, "데이터");
        block1.mine();
        block1.getInformation();

        Block block2 = new Block(2, block1.getBlockHash(), 0, "데이터");
        block2.mine();
        block2.getInformation();

        Block block3 = new Block(3, block2.getBlockHash(), 0, "데이터");
        block3.mine();
        block3.getInformation();

        Block block4 = new Block(4, block3.getBlockHash(), 0, "데이터");
        block4.mine();
        block4.getInformation();
*/
        /*
        Transaction transaction = new Transaction("김진국", "나동빈", 1.5);
        System.out.println(transaction.getInformation());
        */

        Block block1 = new Block(1, null, 0, new ArrayList());
        block1.mine();
        block1.getInformation();

        Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList());
        block2.addTransaction(new Transaction("나동빈", "박한울", 1.5));
        block2.addTransaction(new Transaction("이태일", "박한울", 0.7));
        block2.mine();
        block2.getInformation();

        Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList());
        block3.addTransaction(new Transaction("강종구", "이상욱", 8.2));
        block3.addTransaction(new Transaction("박한울", "나동빈", 0.4));
        block3.mine();
        block3.getInformation();

        Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList());
        block4.addTransaction(new Transaction("이상욱", "강종구", 0.1));
        block4.mine();
        block4.getInformation();


    }
}