package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ni0 {
    public static final ni0 x;
    public static final ni0 y;
    public static final /* synthetic */ ni0[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ni0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ni0] */
    static {
        ?? r0 = new Enum("ASS", 0);
        x = r0;
        ?? r1 = new Enum("SUBRIP", 1);
        y = r1;
        z = new ni0[]{r0, r1};
    }

    public static ni0 valueOf(String str) {
        return (ni0) Enum.valueOf(ni0.class, str);
    }

    public static ni0[] values() {
        return (ni0[]) z.clone();
    }
}
