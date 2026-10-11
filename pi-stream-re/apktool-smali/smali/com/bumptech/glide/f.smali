.class public final Lcom/bumptech/glide/f;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final k:Lcom/bumptech/glide/a;


# instance fields
.field public final a:Ly3/h;

.field public final b:Lx3/p;

.field public final c:Lf9/x;

.field public final d:Lk3/d;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/Map;

.field public final g:Lx3/q;

.field public final h:Landroidx/lifecycle/b0;

.field public final i:I

.field public j:Ll4/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bumptech/glide/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bumptech/glide/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bumptech/glide/f;->k:Lcom/bumptech/glide/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly3/h;Lo1/d0;Lf9/x;Lk3/d;Ln/e;Ljava/util/List;Lx3/q;Landroidx/lifecycle/b0;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/bumptech/glide/f;->a:Ly3/h;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bumptech/glide/f;->c:Lf9/x;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/bumptech/glide/f;->d:Lk3/d;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/bumptech/glide/f;->e:Ljava/util/List;

    .line 15
    .line 16
    iput-object p6, p0, Lcom/bumptech/glide/f;->f:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/bumptech/glide/f;->g:Lx3/q;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/bumptech/glide/f;->h:Landroidx/lifecycle/b0;

    .line 21
    .line 22
    iput p10, p0, Lcom/bumptech/glide/f;->i:I

    .line 23
    .line 24
    new-instance p1, Lx3/p;

    .line 25
    .line 26
    invoke-direct {p1, p3}, Lx3/p;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/bumptech/glide/f;->b:Lx3/p;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Ll4/f;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/f;->j:Ll4/f;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/bumptech/glide/f;->d:Lk3/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ll4/f;

    .line 12
    .line 13
    invoke-direct {v0}, Ll4/f;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, v0, Ll4/a;->K:Z

    .line 18
    .line 19
    iput-object v0, p0, Lcom/bumptech/glide/f;->j:Ll4/f;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/f;->j:Ll4/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-object v0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    monitor-exit p0

    .line 27
    throw v0
.end method

.method public final b()Lcom/bumptech/glide/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/f;->b:Lx3/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx3/p;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/bumptech/glide/j;

    .line 8
    .line 9
    return-object v0
.end method
