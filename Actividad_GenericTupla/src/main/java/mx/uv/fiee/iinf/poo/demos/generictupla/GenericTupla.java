package mx.uv.fiee.iinf.poo.demos.generictupla;

public class GenericTupla <T,N> {
    private final T first;
    private final N second;
    
public GenericTupla (T first, N second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst () {
    return first;
  }

  public N getSecond () {
    return second;
  }

  @Override
  public String toString () {
    return String.format ("(%s, %s)", first.toString (), second.toString ());
  }


}
