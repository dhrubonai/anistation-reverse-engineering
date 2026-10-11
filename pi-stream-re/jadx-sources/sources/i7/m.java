package i7;

/* loaded from: classes.dex */
public final class m {
    public static String a(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
