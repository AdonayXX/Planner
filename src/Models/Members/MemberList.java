/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Members;

import Models.List;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wendy
 */
public class MemberList implements List<Member> {
    private Map<String, Member> members;
    public MemberList() {
        members = new HashMap<>();
    }

    @Override
    public boolean insert(Member obj) {
        members.put(obj.getId(), obj);
        return true; 
    }

    @Override
    public boolean update(Member obj) {
        return insert(obj);
    }

    @Override
    public boolean delete(Member obj) {
        Member removedMember = members.remove(obj.getId());
        return removedMember != null;
    }

    @Override
    public Member search(Object id) {
        return members.get(id);
    }

    @Override
    public Member[] toArray() {
        return members.values().toArray(new Member[0]);
    }
    public void showAll() {
        for (Member member : members.values()) {
            System.out.println(member); 
        }
    }
}

