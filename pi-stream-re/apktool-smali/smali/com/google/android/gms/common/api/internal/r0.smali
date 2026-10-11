.class public final Lcom/google/android/gms/common/api/internal/r0;
.super Lr5/c;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/m;
.implements Lcom/google/android/gms/common/api/n;


# static fields
.field public static final h:Ls4/g;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public final c:Ls4/g;

.field public final d:Ljava/util/Set;

.field public final e:Lcom/google/android/gms/common/internal/h;

.field public f:Lq5/c;

.field public g:Lcom/google/android/gms/common/api/internal/i0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lq5/b;->a:Ls4/g;

    .line 2
    .line 3
    sput-object v0, Lcom/google/android/gms/common/api/internal/r0;->h:Ls4/g;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr5/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/r0;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/r0;->b:Landroid/os/Handler;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/r0;->e:Lcom/google/android/gms/common/internal/h;

    .line 9
    .line 10
    iget-object p1, p3, Lcom/google/android/gms/common/internal/h;->b:Ljava/util/Set;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/r0;->d:Ljava/util/Set;

    .line 13
    .line 14
    sget-object p1, Lcom/google/android/gms/common/api/internal/r0;->h:Ls4/g;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/r0;->c:Ls4/g;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lq5/c;->a(Lr5/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Lb5/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/r0;->g:Lcom/google/android/gms/common/api/internal/i0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/i0;->e(Lb5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
