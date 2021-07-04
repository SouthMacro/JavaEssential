package Lesson3.Task2;

public class BadPupil extends Pupil{
    public BadPupil(Integer... data) {
        super(data);
    }

    @Override
    void study() {
        super.study();
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void write() {
        super.write();
    }

    @Override
    void relax() {
        super.relax();
    }
}
