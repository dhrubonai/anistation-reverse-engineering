package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ja4 {
    public static final ja4 x;
    public static final ja4 y;
    public static final /* synthetic */ ja4[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ja4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ja4] */
    static {
        ?? r0 = new Enum("Width", 0);
        x = r0;
        ?? r1 = new Enum("Height", 1);
        y = r1;
        z = new ja4[]{r0, r1};
    }

    public static ja4 valueOf(String str) {
        return (ja4) Enum.valueOf(ja4.class, str);
    }

    public static ja4[] values() {
        return (ja4[]) z.clone();
    }
}
