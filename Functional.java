public interface Functional<T extends SingleArgumentFunction>{
    double getResult(T f);
}
