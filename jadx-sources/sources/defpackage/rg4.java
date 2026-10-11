package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rg4 {
    public static final rg4 x;
    public static final rg4 y;
    public static final /* synthetic */ rg4[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rg4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rg4] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        x = r0;
        ?? r1 = new Enum("Horizontal", 1);
        y = r1;
        z = new rg4[]{r0, r1};
    }

    public static rg4 valueOf(String str) {
        return (rg4) Enum.valueOf(rg4.class, str);
    }

    public static rg4[] values() {
        return (rg4[]) z.clone();
    }
}
