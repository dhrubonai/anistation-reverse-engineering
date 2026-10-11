package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w67 {
    public static final w67 A;
    public static final w67 B;
    public static final w67 C;
    public static final w67 D;
    public static final w67 E;
    public static final w67 F;
    public static final /* synthetic */ w67[] G;
    public static final w67 x;
    public static final w67 y;
    public static final w67 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Enum, w67] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, w67] */
    static {
        ?? r0 = new Enum("INT", 0);
        x = r0;
        ?? r1 = new Enum("LONG", 1);
        y = r1;
        ?? r2 = new Enum("FLOAT", 2);
        z = r2;
        ?? r3 = new Enum("DOUBLE", 3);
        A = r3;
        ?? r4 = new Enum("BOOLEAN", 4);
        B = r4;
        ?? r5 = new Enum("STRING", 5);
        C = r5;
        xd0 xd0Var = xd0.z;
        ?? r6 = new Enum("BYTE_STRING", 6);
        D = r6;
        ?? r7 = new Enum("ENUM", 7);
        E = r7;
        ?? r8 = new Enum("MESSAGE", 8);
        F = r8;
        G = new w67[]{r0, r1, r2, r3, r4, r5, r6, r7, r8};
    }

    public static w67 valueOf(String str) {
        return (w67) Enum.valueOf(w67.class, str);
    }

    public static w67[] values() {
        return (w67[]) G.clone();
    }
}
