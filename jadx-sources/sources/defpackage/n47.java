package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n47 {
    public static final qc5 x;
    public static final /* synthetic */ n47[] y;
    public static final /* synthetic */ tv1 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [n47, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [n47, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [n47, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [n47, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [n47, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [n47, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [n47, java.lang.Enum] */
    static {
        n47[] n47VarArr = {new Enum("MONDAY", 0), new Enum("TUESDAY", 1), new Enum("WEDNESDAY", 2), new Enum("THURSDAY", 3), new Enum("FRIDAY", 4), new Enum("SATURDAY", 5), new Enum("SUNDAY", 6)};
        y = n47VarArr;
        z = new tv1(n47VarArr);
        x = new qc5((byte) 8);
    }

    public static n47 valueOf(String str) {
        return (n47) Enum.valueOf(n47.class, str);
    }

    public static n47[] values() {
        return (n47[]) y.clone();
    }
}
