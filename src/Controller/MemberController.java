/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Members.Member;
import Models.Members.MemberList;
import View.View;

/**
 *
 * @author wendy
 */
public class MemberController implements Controller<Member> {
    MemberList list;
    View view;
  public MemberController(View view) {
  list=MemberList.getInstance();
  this.view=view;
 }

 @Override
 public void insert(Member obj) {
 if( obj.isComplete()){
     this.list.insert(obj);
     this.readAll();
 }else{
     this.view.displayErrorMessaje("Datos faltantes");
 }
 }

 @Override
 public void update(Member obj) {
     if (obj.isComplete()) {
      this.list.update(obj);
      this.readAll();
     }else{
        this.view.displayErrorMessaje("No se ha podido actualizar correctamente");
     }
 }
 @Override
 public void delete(Member obj) {
     if (this.delete(obj)) {
     this.readAll();
     }else{
         this.view.displayErrorMessaje("No se encuentra el miembro o la lista no está completa");
 }
 }
 @Override
 public void read(Object id) {
    Member member=this.list.search(id);
    if(member != null){
        this.view.
    }
 }
 @Override
 public void readAll(){
     
 }
}
