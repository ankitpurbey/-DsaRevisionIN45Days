int getCount(Node root,int l, int h)
{
    //Your code here
    if(root==null){
        return 0;
    }
    int count =0;
    if(root.data>=l && root.data<=h){
        count++;
    }
    
    count    += getCount(root.left,l,h);
    count  += getCount(root.right,l, h);
    
    
    return count;
    
}
