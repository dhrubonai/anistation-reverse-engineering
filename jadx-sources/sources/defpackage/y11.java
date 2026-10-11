package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y11 {
    public static final y11 A;
    public static final /* synthetic */ y11[] B;
    public static final y11 x;
    public static final y11 y;
    public static final y11 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y11] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y11] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y11] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, y11] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        x = r0;
        ?? r1 = new Enum("LAZY", 1);
        y = r1;
        ?? r2 = new Enum("ATOMIC", 2);
        z = r2;
        ?? r3 = new Enum("UNDISPATCHED", 3);
        A = r3;
        B = new y11[]{r0, r1, r2, r3};
    }

    public static y11 valueOf(String str) {
        return (y11) Enum.valueOf(y11.class, str);
    }

    public static y11[] values() {
        return (y11[]) B.clone();
    }
}
