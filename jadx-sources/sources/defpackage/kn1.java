package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kn1 {
    public static final /* synthetic */ kn1[] A;
    public static final kn1 x;
    public static final kn1 y;
    public static final kn1 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kn1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kn1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kn1] */
    static {
        ?? r0 = new Enum("Yes", 0);
        x = r0;
        ?? r1 = new Enum("No", 1);
        y = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        z = r2;
        A = new kn1[]{r0, r1, r2};
    }

    public static kn1 valueOf(String str) {
        return (kn1) Enum.valueOf(kn1.class, str);
    }

    public static kn1[] values() {
        return (kn1[]) A.clone();
    }
}
