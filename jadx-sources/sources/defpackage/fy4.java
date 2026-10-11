package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fy4 {
    public static final fy4 x;
    public static final fy4 y;
    public static final /* synthetic */ fy4[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [fy4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fy4, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Available", 0);
        x = r0;
        ?? r1 = new Enum("Unavailable", 1);
        y = r1;
        z = new fy4[]{r0, r1};
    }

    public static fy4 valueOf(String str) {
        return (fy4) Enum.valueOf(fy4.class, str);
    }

    public static fy4[] values() {
        return (fy4[]) z.clone();
    }
}
