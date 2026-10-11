package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v22 {
    public static final v22 x;
    public static final /* synthetic */ v22[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v22] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v22] */
    static {
        ?? r0 = new Enum("TOP_DOWN", 0);
        x = r0;
        y = new v22[]{r0, new Enum("BOTTOM_UP", 1)};
    }

    public static v22 valueOf(String str) {
        return (v22) Enum.valueOf(v22.class, str);
    }

    public static v22[] values() {
        return (v22[]) y.clone();
    }
}
