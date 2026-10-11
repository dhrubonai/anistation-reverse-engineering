.class public final Landroidx/activity/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;
.implements Landroidx/activity/a;


# instance fields
.field public final a:Landroidx/lifecycle/p;

.field public final b:Landroidx/fragment/app/k0;

.field public c:Landroidx/activity/q;

.field public final synthetic d:Landroidx/activity/r;


# direct methods
.method public constructor <init>(Landroidx/activity/r;Landroidx/lifecycle/p;Landroidx/fragment/app/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/p;->d:Landroidx/activity/r;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/p;->a:Landroidx/lifecycle/p;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/p;->b:Landroidx/fragment/app/k0;

    .line 9
    .line 10
    invoke-virtual {p2, p0}, Landroidx/lifecycle/p;->a(Landroidx/lifecycle/t;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/p;->a:Landroidx/lifecycle/p;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/t;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/p;->b:Landroidx/fragment/app/k0;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/k0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/activity/p;->c:Landroidx/activity/q;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/activity/q;->cancel()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/activity/p;->c:Landroidx/activity/q;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onStateChanged(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V
    .locals 2

    .line 1
    sget-object p1, Landroidx/lifecycle/n;->ON_START:Landroidx/lifecycle/n;

    .line 2
    .line 3
    if-ne p2, p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/activity/p;->d:Landroidx/activity/r;

    .line 6
    .line 7
    iget-object p2, p1, Landroidx/activity/r;->b:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/activity/p;->b:Landroidx/fragment/app/k0;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    new-instance p2, Landroidx/activity/q;

    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, Landroidx/activity/q;-><init>(Landroidx/activity/r;Landroidx/fragment/app/k0;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Landroidx/fragment/app/k0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/bumptech/glide/d;->G()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/activity/r;->b()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, Landroidx/activity/r;->c:Landroidx/fragment/app/z;

    .line 34
    .line 35
    iput-object p1, v0, Landroidx/fragment/app/k0;->c:Lf0/a;

    .line 36
    .line 37
    :cond_0
    iput-object p2, p0, Landroidx/activity/p;->c:Landroidx/activity/q;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object p1, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 41
    .line 42
    if-ne p2, p1, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Landroidx/activity/p;->c:Landroidx/activity/q;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/activity/q;->cancel()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    sget-object p1, Landroidx/lifecycle/n;->ON_DESTROY:Landroidx/lifecycle/n;

    .line 53
    .line 54
    if-ne p2, p1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/activity/p;->cancel()V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_0
    return-void
.end method
