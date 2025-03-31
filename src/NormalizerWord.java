import java.text.Normalizer;

public class NormalizerWord {
    public static String removeAccents(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }
}
