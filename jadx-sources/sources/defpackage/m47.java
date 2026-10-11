package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m47 {
    public static final m47 x;
    public static final m47 y;
    public static final /* synthetic */ m47[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [m47, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m47, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Start", 0);
        x = r0;
        ?? r1 = new Enum("End", 1);
        y = r1;
        z = new m47[]{r0, r1};
    }

    public static m47 valueOf(String str) {
        return (m47) Enum.valueOf(m47.class, str);
    }

    public static m47[] values() {
        return (m47[]) z.clone();
    }
}
