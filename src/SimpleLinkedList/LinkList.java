package SimpleLinkedList;

public class LinkList {
    private Link first;

    public void LinkList(){
        first =null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void iinsertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first= newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }


}
