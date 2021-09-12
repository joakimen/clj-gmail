# clj-gmail

Check your Gmail-inbox with Clojure.

## Usage

### 1. Add Gmail-credentials

`~/.config/gmail.toml` :

```sh
[auth]
user = "<username>@gmail.com"
pass = "<password>"
```

### 2. Retrieve all mail from inbox

```text
$ lein run
[2021/08/02 10:57] <John Johnson> Let's grab coffee some day?
[2021/08/01 05:01] <Amazon.com> Your Amazon.com order #123-456 has shipped
[2021/09/12 02:25] <Google> (no subject)
```

Mails are formatted with the following info:

```sh
[timestamp] <sender-name/address> subject
```
