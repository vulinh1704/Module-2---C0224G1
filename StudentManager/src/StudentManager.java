
public class StudentManager {
    private Student[] list = new Student[100];
    private int size = 0;

    public void add(Student newStudent) {
        list[size] = newStudent;
        size++;
    }

    public void edit(int id, Student newStudent) {
        int index = findIndexById(id);
        list[index] = newStudent;
    }

    public int findIndexById(int id) {
        for (int i = 0; i < this.size; i++) {
            if(id == list[i].getId()) {
                return i;
            }
        }
       return -1;
    }

    public Student[] getAll() {
        return this.list;
    }

    public int getSize() {
        return this.size;
    }
}
