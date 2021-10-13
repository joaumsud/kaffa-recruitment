class CreateTarefas < ActiveRecord::Migration[6.1]
  def change
    create_table :tarefas do |t|
      t.string :title
      t.boolean :done

      t.timestamps
    end
  end
end
