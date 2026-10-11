package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class k31 {
    public static final /* synthetic */ k31[] A;
    public static final k31 x;
    public static final k31 y;
    public static final k31 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k31] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k31] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k31] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, k31] */
    static {
        ?? r0 = new Enum("None", 0);
        x = r0;
        ?? r1 = new Enum("Cancelled", 1);
        y = r1;
        ?? r2 = new Enum("Redirected", 2);
        z = r2;
        A = new k31[]{r0, r1, r2, new Enum("RedirectCancelled", 3)};
    }

    public static k31 valueOf(String str) {
        return (k31) Enum.valueOf(k31.class, str);
    }

    public static k31[] values() {
        return (k31[]) A.clone();
    }
}
