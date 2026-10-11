package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c35 {
    public static final c35 x;
    public static final /* synthetic */ c35[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c35] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c35] */
    static {
        ?? r0 = new Enum("Restart", 0);
        x = r0;
        y = new c35[]{r0, new Enum("Reverse", 1)};
    }

    public static c35 valueOf(String str) {
        return (c35) Enum.valueOf(c35.class, str);
    }

    public static c35[] values() {
        return (c35[]) y.clone();
    }
}
