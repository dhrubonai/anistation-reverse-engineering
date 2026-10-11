package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pk4 {
    public static final pk4 A;
    public static final pk4 B;
    public static final pk4 C;
    public static final pk4 D;
    public static final /* synthetic */ pk4[] E;
    public static final pk4 x;
    public static final pk4 y;
    public static final pk4 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pk4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pk4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pk4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pk4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pk4] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, pk4] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, pk4] */
    static {
        ?? r0 = new Enum("Invalid", 0);
        x = r0;
        ?? r1 = new Enum("Cancelled", 1);
        y = r1;
        ?? r2 = new Enum("InitialPending", 2);
        z = r2;
        ?? r3 = new Enum("RecomposePending", 3);
        A = r3;
        ?? r4 = new Enum("Recomposing", 4);
        B = r4;
        ?? r5 = new Enum("ApplyPending", 5);
        C = r5;
        ?? r6 = new Enum("Applied", 6);
        D = r6;
        E = new pk4[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static pk4 valueOf(String str) {
        return (pk4) Enum.valueOf(pk4.class, str);
    }

    public static pk4[] values() {
        return (pk4[]) E.clone();
    }
}
