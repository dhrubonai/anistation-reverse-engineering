package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ef5 {
    public static final ef5 x;
    public static final ef5 y;
    public static final /* synthetic */ ef5[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ef5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ef5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ef5] */
    static {
        ?? r0 = new Enum("Inherit", 0);
        x = r0;
        ?? r1 = new Enum("SecureOn", 1);
        y = r1;
        z = new ef5[]{r0, r1, new Enum("SecureOff", 2)};
    }

    public static ef5 valueOf(String str) {
        return (ef5) Enum.valueOf(ef5.class, str);
    }

    public static ef5[] values() {
        return (ef5[]) z.clone();
    }
}
