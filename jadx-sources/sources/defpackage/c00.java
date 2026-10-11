package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c00 {
    public static final c00 x;
    public static final c00 y;
    public static final /* synthetic */ c00[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [c00, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c00, java.lang.Enum] */
    static {
        ?? r0 = new Enum("EXPONENTIAL", 0);
        x = r0;
        ?? r1 = new Enum("LINEAR", 1);
        y = r1;
        z = new c00[]{r0, r1};
    }

    public static c00 valueOf(String str) {
        return (c00) Enum.valueOf(c00.class, str);
    }

    public static c00[] values() {
        return (c00[]) z.clone();
    }
}
