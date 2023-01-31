package com.pc.composite;

import java.util.List;

/**
 * 组合模式
 *
 * @author pengchao
 * @since 2023/1/31 11:34
 */
public class Client {
    public static void main(String[] args) {
        IBranch ceo = compositeCropTree();
//        System.out.println(ceo.getInfo());

        System.out.println(getTreeInfo(ceo));
    }

    private static IBranch compositeCropTree() {
        IBranch ceo = new Branch("库克", "ceo", 10000000d);
        IBranch techLeader = new Branch("雷军", "技术leader", 1000000d);
        IBranch bizLeader = new Branch("马云", "业务leader", 1000000d);
        ILeaf developer1 = new Leaf("马斯克", "大头兵", 100000d);
        ILeaf developer2 = new Leaf("扎克伯格", "大头兵", 100000d);
        ILeaf pm = new Leaf("张小龙", "产品经理", 100000d);

        ceo.addCrop(techLeader);
        ceo.addCrop(bizLeader);

        techLeader.addCrop(developer1);
        techLeader.addCrop(developer2);

        bizLeader.addCrop(pm);

        return ceo;
    }

    private static String getTreeInfo(IBranch ceo) {
        List<ICrop> childes = ceo.getChildes();
        StringBuilder info = new StringBuilder("");
        for (ICrop crop : childes) {
            if (crop instanceof ILeaf) {
                info.append(crop.getInfo()).append("\n");
            } else {
                //想要不进行强制转换, 可以使用透明模式, 即leaf也实现getTreeInfo(), 但不可用
                info.append(crop.getInfo()).append("\n").append(getTreeInfo((IBranch) crop));
            }
        }
        return info.toString();
    }


}


