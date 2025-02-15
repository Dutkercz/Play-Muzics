package Dev2025.PlayMuzics.components;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class ChatGpt {
    private final ChatClient chatClient;

    public ChatGpt(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    public ChatClient getChatClient() {
        return chatClient;
    }

    public String askChat (String aks){
        return chatClient.prompt().user(aks).call().content();
    }
}
