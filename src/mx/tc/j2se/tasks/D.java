package mx.tc.j2se.tasks;


    public class D implements B{
        @Override
        public  LinkedTaskList incoming() {
            return new LinkedTaskList();
        }
}
