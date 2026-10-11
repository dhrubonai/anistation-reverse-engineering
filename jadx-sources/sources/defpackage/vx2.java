package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vx2 {
    public static final vx2 A;
    public static final /* synthetic */ vx2[] B;
    public static final vx2 x;
    public static final vx2 y;
    public static final vx2 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [vx2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [vx2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [vx2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [vx2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Untransformed", 0);
        x = r0;
        ?? r1 = new Enum("Insertion", 1);
        y = r1;
        ?? r2 = new Enum("Replacement", 2);
        z = r2;
        ?? r3 = new Enum("Deletion", 3);
        A = r3;
        B = new vx2[]{r0, r1, r2, r3};
    }

    public static vx2 valueOf(String str) {
        return (vx2) Enum.valueOf(vx2.class, str);
    }

    public static vx2[] values() {
        return (vx2[]) B.clone();
    }
}
