package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j77 {
    public static final j77 A;
    public static final j77 B;
    public static final j77 C;
    public static final /* synthetic */ j77[] D;
    public static final j77 x;
    public static final j77 y;
    public static final j77 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j77] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j77] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j77] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j77] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j77] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j77] */
    static {
        ?? r0 = new Enum("ENQUEUED", 0);
        x = r0;
        ?? r1 = new Enum("RUNNING", 1);
        y = r1;
        ?? r2 = new Enum("SUCCEEDED", 2);
        z = r2;
        ?? r3 = new Enum("FAILED", 3);
        A = r3;
        ?? r4 = new Enum("BLOCKED", 4);
        B = r4;
        ?? r5 = new Enum("CANCELLED", 5);
        C = r5;
        D = new j77[]{r0, r1, r2, r3, r4, r5};
    }

    public static j77 valueOf(String str) {
        return (j77) Enum.valueOf(j77.class, str);
    }

    public static j77[] values() {
        return (j77[]) D.clone();
    }

    public final boolean a() {
        if (this != z && this != A && this != C) {
            return false;
        }
        return true;
    }
}
