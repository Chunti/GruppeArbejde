public class ItemRoller {
    public ItemRoller(){}

    public Integer[] epicItem(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+8);
        data[1] = (int)(3*Math.random()+8);
        data[2] = (int)(3*Math.random()+4);
        return data;
    }

    public Integer[] rareItem(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+6);
        data[1] = (int)(3*Math.random()+6);
        data[2] = (int)(3*Math.random()+2);
        return data;
    }

    public Integer[] uncommonItem(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+4);
        data[1] = (int)(3*Math.random()+4);
        data[2] = (int)(3*Math.random()+1);
        return data;
    }

    public Integer[] commonItem(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+2);
        data[1] = (int)(3*Math.random()+2);
        data[2] = (int)(3*Math.random()+0);
        return data;
    }

    public Integer[] epicArmor(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+4);
        data[1] = (int)(3*Math.random()+8);
        data[2] = (int)(3*Math.random()+8);
        return data;
    }

    public Integer[] rareArmor(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+2);
        data[1] = (int)(3*Math.random()+6);
        data[2] = (int)(3*Math.random()+6);
        return data;
    }

    public Integer[] uncommonArmor(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+1);
        data[1] = (int)(3*Math.random()+4);
        data[2] = (int)(3*Math.random()+4);
        return data;
    }

    public Integer[] commonArmor(){
        Integer[] data = new Integer[3];
        data[0] = (int)(3*Math.random()+0);
        data[1] = (int)(3*Math.random()+2);
        data[2] = (int)(3*Math.random()+2);
        return data;
    }
}
