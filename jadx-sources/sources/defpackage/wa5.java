package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wa5 {
    public static final wa5 A;
    public static final wa5 B;
    public static final /* synthetic */ wa5[] C;
    public static final wa5 x;
    public static final wa5 y;
    public static final wa5 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wa5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wa5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wa5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, wa5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, wa5] */
    static {
        ?? r0 = new Enum("TopBar", 0);
        x = r0;
        ?? r1 = new Enum("MainContent", 1);
        y = r1;
        ?? r2 = new Enum("Snackbar", 2);
        z = r2;
        ?? r3 = new Enum("Fab", 3);
        A = r3;
        ?? r4 = new Enum("BottomBar", 4);
        B = r4;
        C = new wa5[]{r0, r1, r2, r3, r4};
    }

    public static wa5 valueOf(String str) {
        return (wa5) Enum.valueOf(wa5.class, str);
    }

    public static wa5[] values() {
        return (wa5[]) C.clone();
    }
}
