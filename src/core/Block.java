package core;

import util.Util;

import java.util.ArrayList;

/**
 * Created by A on 2019-02-10 오후 6:24
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


public class Block {

    private int blockID;
    private String previousBlockHash;
    private int nonce;
    //    private String data;
    private ArrayList<Transaction> transactionList;

    //    public Block(int blockID, String previousBlockHash, int nonce, String data) {
//        this.blockID = blockID;
//        this.previousBlockHash = previousBlockHash;
//        this.nonce = nonce;
//        this.data = data;
//    }
    public Block(int blockID, String previousBlockHash, int nonce, ArrayList transactionList) {
        this.blockID = blockID;
        this.previousBlockHash = previousBlockHash;
        this.nonce = nonce;
        this.transactionList = transactionList;


    }

    public int getBlockID() {
        return blockID;
    }

    public void setBlockID(int blockID) {
        this.blockID = blockID;
    }

    public String getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(String previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }


    public ArrayList getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList transactionList) {
        this.transactionList = transactionList;
    }

    public void getInformation() {
        System.out.println("----------------------------");
        System.out.println("채굴 번호 : " + getBlockID());
        System.out.println("이전 해시 값 : " + getPreviousBlockHash());
        System.out.println("채굴 번수 값 : " + getNonce());
        System.out.println("트랜잭션 개수 : " + transactionList.size() + "개");
        for (int i = 0; i < transactionList.size(); i++) {
            System.out.println(transactionList.get(i).getInformation());
        }
        System.out.println("블록 해시 : " + getBlockHash());
        System.out.println("----------------------------");
    }

    public String getBlockHash() {
        String transactionInformations = "";
        for (int i = 0; i < transactionList.size(); i++) {
            transactionInformations += transactionList.get(i).getInformation();
        }
        return Util.getHash(nonce + transactionInformations + previousBlockHash);
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public void mine() {
        while (true) {
            if (getBlockHash().substring(0, 4).equals("0000")) {
                System.out.println(blockID + "번째 블록의 채굴에 성공했습니다.");
                break;
            }
            nonce++;
        }
    }
}