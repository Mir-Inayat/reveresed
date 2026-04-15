package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f336b;
    public static final m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f339f;

    static {
        m mVar = new m("DESTROYED", 0);
        f335a = mVar;
        m mVar2 = new m("INITIALIZED", 1);
        f336b = mVar2;
        m mVar3 = new m("CREATED", 2);
        c = mVar3;
        m mVar4 = new m("STARTED", 3);
        f337d = mVar4;
        m mVar5 = new m("RESUMED", 4);
        f338e = mVar5;
        f339f = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f339f.clone();
    }
}
