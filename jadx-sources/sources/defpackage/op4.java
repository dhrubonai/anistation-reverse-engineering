package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class op4 {
    public static final op4 x;
    public static final op4 y;
    public static final /* synthetic */ op4[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [op4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [op4, java.lang.Enum] */
    static {
        ?? r0 = new Enum("TowardFullscreen", 0);
        x = r0;
        ?? r1 = new Enum("TowardMiniPlayer", 1);
        y = r1;
        z = new op4[]{r0, r1};
    }

    public static op4 valueOf(String str) {
        return (op4) Enum.valueOf(op4.class, str);
    }

    public static op4[] values() {
        return (op4[]) z.clone();
    }
}
