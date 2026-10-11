package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kk1 {
    public static final kk1 x;
    public static final kk1 y;
    public static final /* synthetic */ kk1[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [kk1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kk1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Internal", 0);
        x = r0;
        ?? r1 = new Enum("External", 1);
        y = r1;
        z = new kk1[]{r0, r1};
    }

    public static kk1 valueOf(String str) {
        return (kk1) Enum.valueOf(kk1.class, str);
    }

    public static kk1[] values() {
        return (kk1[]) z.clone();
    }
}
